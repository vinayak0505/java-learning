package LLD.Questions.Elevator.Button;

import LLD.Questions.Elevator.Level;
import LLD.Questions.Elevator.Helper.CustomPassFunction;

public class InternalButtonImpl implements Button<Level> {

    final private Level level;
    private boolean isSelected = false;
    private final CustomPassFunction<Void, Level> onClickFunction;

    public InternalButtonImpl(Level level, CustomPassFunction<Void, Level> onClick) {
        this.level = level;
        this.onClickFunction = onClick;
    }

    @Override
    public void onClick() {
        if (getIsSelected())
            return;
        onClickFunction.function(level);
        setSelected(true);
    }

    @Override
    public boolean getIsSelected() {
        return isSelected;
    }

    @Override
    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public Level getCurrentValue(){
        return level;
    }
}
