package com.momobites.prash.varnamaala.ModelAdapters;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.Drawing.DrawBoard;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.content.Context.AUDIO_SERVICE;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;


public class LetterAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<LetterModel> list = Collections.emptyList();
    Context context;
    private LayoutInflater inflater;



    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;
    /** Handles audio focus when playing a sound file */
    private AudioManager mAudioManager;

    // This listener gets triggered whenever the audio focus changes
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                // When transient audio lapse - pause the app
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                // When audio returns
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                // When the audio is complete
                // Stop playback and clean up resources
                releaseMediaPlayer();
            }
        }
    };

    // Runs when MediaPlayer is through running the audio
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    // Clean Media Player Resource
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }



    public LetterAdapter(Context context, ArrayList<LetterModel> data) {
    this.context = context;
        this.list = data;
        inflater = LayoutInflater.from(context);

    }

    /*
    * inflates the row layout is and initializes the View Holder. Once the View Holder is
    * initialized it manages the findViewById() methods, finding the views once and recycling
    * them to avoid repeated calls.
    * */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    /*
    * uses the View Holder constructed in the onCreateViewHolder() method to populate the
    * current row of the RecyclerView with data.
    * */
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.NepaliWord.setText(list.get(position).getNepaliTranslationId());
        viewHolder.DevgnagariWord.setText(list.get(position).getDevnagariId());
        viewHolder.EnglishWord.setText(list.get(position).getmEnglishId());

        viewHolder.DevgnagariWord.setTextSize(150);
        viewHolder.NepaliWord.setVisibility(GONE);
        viewHolder.EnglishWord.setVisibility(GONE);

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);


        viewHolder.btn_draw.setVisibility(VISIBLE);
        viewHolder.PrimaryImage.setVisibility(GONE);
        viewHolder.AdditionalDetails.setVisibility(GONE);
        viewHolder.aspiration.setText(list.get(position).getmAspiration());
        viewHolder.name.setText(list.get(position).getmName());
        viewHolder.pronunciation.setText(list.get(position).getmPronunciation());
        viewHolder.approximatePronunciation.setText(list.get(position).getmApproxPronunciation());


        /*On ImageView Button Press - for Intent*/
        viewHolder.btn_additional_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (viewHolder.AdditionalDetails.getVisibility() == GONE) {
                    viewHolder.AdditionalDetails.setVisibility(VISIBLE);
                    viewHolder.btn_additional_details.setImageResource(R.drawable.icon_collapse);
                }
                else {
                    viewHolder.AdditionalDetails.setVisibility(GONE);
                    viewHolder.btn_additional_details.setImageResource(R.drawable.icon_expand);
                }



            }

        });

        /*On ImageView Button Press - for Intent*/
        viewHolder.btn_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DrawBoard.class);
                intent.putExtra("DevWord", list.get(position).getDevnagariId());
                // Compounds
                intent.putExtra("DevString", list.get(position).getmCompoundDevIdString());
                intent.putExtra("NepString", list.get(position).getmCompoundNepIdString());

                // Start Intent
                context.startActivity(intent);
            }

        });


        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(context, DrawBoard.class);
                intent.putExtra("DevWord", list.get(position).getDevnagariId());
                // Compounds
                intent.putExtra("DevString", list.get(position).getmCompoundDevIdString());
                intent.putExtra("NepString", list.get(position).getmCompoundNepIdString());

                // Start Intent
                context.startActivity(intent);
                return true;
            };
        });


        /*On Item Click for Audio*/
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Release the media player if it currently exists because we are about to
                // play a different sound file
               releaseMediaPlayer();
                // Get the  object at the given position the user clicked on
                final int  AudioObject = list.get(position).getmAudioResourceId();
                // Toast.makeText(context,  AudioObject, Toast.LENGTH_SHORT).show();

                // Request audio focus
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.
                    mMediaPlayer = MediaPlayer.create( context, AudioObject );
                    // Start the audio file
                    mMediaPlayer.start();
                    // Setup a listener on the media player
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}