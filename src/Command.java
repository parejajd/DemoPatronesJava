public abstract class Command {
    public Humano editor;
    public Patojen patojen;

    Command(Humano editor, Patojen patojen) {
        this.editor = editor;
        this.patojen = patojen;
    }

    public abstract void execute();
}