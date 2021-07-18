 public class TosCommand extends Command {
    public TosCommand(Humano editor, Patojen patojen) {
        super(editor,patojen);
    }
    @Override
    public void execute() { 
        editor.textField.append(this.patojen.id + " Generando Tos" + "\n");  
    }    
}
