package LearnPatterns.ComandPattern.MVC.implementation;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
    BeatModelInterface model;
    ControllerInterface controller;
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;
    
    public DJView(ControllerInterface controller, BeatModelInterface model) { 
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver)this);
        model.registerObserver((BPMObserver)this);
    }
    
    public void createView() {
    // Create all Swing components here
    }
    
    public void updateBPM() {
    int bpm = this.model.getBPM();
    if (bpm == 0) {
    this.bpmOutputLabel.setText(“offline”);
    } else {
    bpmOutputLabel.setText(“Current BPM: “ + model.getBPM());
    }
    }
    
    public void updateBeat() {
    this.beatBar.setValue(100);
    }
   }
