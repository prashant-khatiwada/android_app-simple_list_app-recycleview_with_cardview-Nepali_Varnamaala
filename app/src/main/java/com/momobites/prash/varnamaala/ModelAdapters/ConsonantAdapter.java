package com.momobites.prash.varnamaala.ModelAdapters;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.R.attr.x;
import static android.content.Context.AUDIO_SERVICE;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;


public class ConsonantAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<ConsonantModel> list = Collections.emptyList();
    Context context;
    private LayoutInflater inflater;

    /** Handles playback of all the sound files */
    private static MediaPlayer mMediaPlayer;
    /** Handles audio focus when playing a sound file */
    private static AudioManager mAudioManager;



    public ConsonantAdapter(Context context, ArrayList<ConsonantModel> data) {
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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
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


        /*Working Solution*/
        /*Setting the word for each item*/
        viewHolder.K1.setText(list.get(position).getmDevCompoundId(0));
        viewHolder.K2.setText(list.get(position).getmDevCompoundId(1));
        viewHolder.K3.setText(list.get(position).getmDevCompoundId(2));
        viewHolder.K4.setText(list.get(position).getmDevCompoundId(3));
        viewHolder.K5.setText(list.get(position).getmDevCompoundId(4));
        viewHolder.K6.setText(list.get(position).getmDevCompoundId(5));
        viewHolder.K7.setText(list.get(position).getmDevCompoundId(6));
        viewHolder.K8.setText(list.get(position).getmDevCompoundId(7));
        viewHolder.K9.setText(list.get(position).getmDevCompoundId(8));
        viewHolder.K10.setText(list.get(position).getmDevCompoundId(9));
        viewHolder.K11.setText(list.get(position).getmDevCompoundId(10));
        viewHolder.K12.setText(list.get(position).getmDevCompoundId(11));
        
        /*Setting the word for each item*/
        viewHolder.NepC1.setText(list.get(position).getmNepCompoundId(0));
        viewHolder.NepC2.setText(list.get(position).getmNepCompoundId(1));
        viewHolder.NepC3.setText(list.get(position).getmNepCompoundId(2));
        viewHolder.NepC4.setText(list.get(position).getmNepCompoundId(3));
        viewHolder.NepC5.setText(list.get(position).getmNepCompoundId(4));
        viewHolder.NepC6.setText(list.get(position).getmNepCompoundId(5));
        viewHolder.NepC7.setText(list.get(position).getmNepCompoundId(6));
        viewHolder.NepC8.setText(list.get(position).getmNepCompoundId(7));
        viewHolder.NepC9.setText(list.get(position).getmNepCompoundId(8));
        viewHolder.NepC10.setText(list.get(position).getmNepCompoundId(9));
        viewHolder.NepC11.setText(list.get(position).getmNepCompoundId(10));
        viewHolder.NepC12.setText(list.get(position).getmNepCompoundId(11));

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);

        /*On ImageView Button Press - for Audio*/
        viewHolder.btn_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Release the media player if it currently exists because we are about to
                // play a different sound file
                AudioPlayback.releaseMediaPlayer();
                // Get the  object at the given position the user clicked on
                final int  AudioObject = list.get(position).getmAudioResourceId();
                // Toast.makeText(context,  AudioObject, Toast.LENGTH_SHORT).show();

                // Request audio focus
                int result = mAudioManager.requestAudioFocus(AudioPlayback.mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.
                    mMediaPlayer = MediaPlayer.create( context, AudioObject );
                    // Start the audio file
                    mMediaPlayer.start();
                    // Setup a listener on the media player
                    mMediaPlayer.setOnCompletionListener(AudioPlayback.mCompletionListener);
                }

            }

        });

        /*On ImageView Button Press - for Compounds*/
        viewHolder.btn_compounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewHolder.Compounnds.getVisibility() == GONE){
                    viewHolder.Compounnds.setVisibility(VISIBLE);

                } else {
                    viewHolder.Compounnds.setVisibility(GONE);
                };

            }

        });

        /*On Item Click View*/
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewHolder.AdditionalDetail.getVisibility() == GONE){
                    viewHolder.AdditionalDetail.setVisibility(VISIBLE);
                    viewHolder.DevgnagariWord.setTextSize(200);
                } else {
                    viewHolder.AdditionalDetail.setVisibility(GONE);
                    viewHolder.Compounnds.setVisibility(GONE);
                    viewHolder.DevgnagariWord.setTextSize(60);
                };

            }
        });

        /*Additional Details*/
        viewHolder.Aspiration.setText(list.get(position).getmAspiration());
        viewHolder.Name.setText(list.get(position).getmName());
        viewHolder.Pronunciation.setText(list.get(position).getmPronunciation());
        viewHolder.ApproximatePronunciation.setText(list.get(position).getmApproxPronunciation());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}