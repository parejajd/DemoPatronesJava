 
public class FiebreCommand  extends Command {

    public FiebreCommand(Humano editor, Patojen patojen) {
        super(editor,patojen);
    }
    @Override
    public void execute() { 
        editor.textField.append(this.patojen.id + " Generando Fiebre" + "\n");  
    }    
}
