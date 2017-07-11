package com.momobites.prash.varnamaala.ModelAdapters;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.content.Context.AUDIO_SERVICE;
import static android.view.View.GONE;


/**
 * Created by prash on 6/24/2017.
 */

public class WordAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<WordModel> list = Collections.emptyList();
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



    public WordAdapter(Context context, ArrayList<WordModel> data) {
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

        viewHolder.btn_additional_details.setVisibility(View.GONE);
        viewHolder.AdditionalDetails.setVisibility(GONE);
        viewHolder.DevgnagariWord.setTextSize(40);
        viewHolder.SecondaryImage.setVisibility(GONE);


        // For Image
        // Check if an image is provided for this menu or not
        if (list.get(position).hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            viewHolder.PrimaryImage.setImageResource(list.get(position).getImageResourceId());
            // Make sure the view is visible
            viewHolder.PrimaryImage.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            viewHolder.PrimaryImage.setVisibility(View.GONE);
        }


        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);

        /*On Item Click View*/
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();
                // Get the  object at the given position the user clicked on
                final int  x = list.get(position).getmAudioResourceId();

                // Toast.makeText(context,  x, Toast.LENGTH_SHORT).show();

                // Request audio focus
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.
                    mMediaPlayer = MediaPlayer.create( context, x );
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
