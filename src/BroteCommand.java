public class BroteCommand extends Command {
    public BroteCommand (Humano editor, Patojen patojen) {
        super(editor,patojen);
    }
    @Override
    public void execute() { 
        editor.textField.append(this.patojen.id + " Generando Tos" + "\n");  
    }    
}