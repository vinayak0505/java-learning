package LLD.Questions.Elevator.Button;

public interface Button<T> {
    public void onClick();
    public boolean getIsSelected();
    public void setSelected(boolean selected);
    public T getCurrentValue();
}
