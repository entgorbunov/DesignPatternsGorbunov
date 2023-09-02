package org.example.basepatterns.behavioral.command;
//concreteCommand
public class ResetCommand implements Command{
    Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.reset();
    }
}
