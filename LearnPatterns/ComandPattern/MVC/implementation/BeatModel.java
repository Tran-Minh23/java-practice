package LearnPatterns.ComandPattern.MVC.implementation;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.Sequencer;

import LearnPatterns.ComandPattern.MVC.interfaces.BPMObserver;
import LearnPatterns.ComandPattern.MVC.interfaces.BeatModelInterface;
import LearnPatterns.ComandPattern.MVC.interfaces.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bpm = 90;
    // other instance variables here

    public void initialize() {
    // setUpMidi();
    // buildTrackAndStart();
    }

    public void on() {
        this.sequencer.start();
        this.setBPM(90);
    }

    public void off() {
        this.setBPM(0);
        this.sequencer.stop();
    }

    public void setBPM(int bpm) {
        this.bpm = bpm;
        this.sequencer.setTempoInBPM(this.getBPM());
        notifyBPMObservers();
    }
    
    public int getBPM() {
        return this.bpm;
    }
    
    void beatEvent() {
        notifyBeatObservers();
    }
    @Override
    public void registerObserver(BeatObserver o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerObserver'");
    }
    @Override
    public void removeObserver(BeatObserver o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeObserver'");
    }
    @Override
    public void registerObserver(BPMObserver o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerObserver'");
    }
    @Override
    public void removeObserver(BPMObserver o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeObserver'");
    }
    
    // Code to register and notify observers
    // Lots of MIDI code to handle the beat
}
