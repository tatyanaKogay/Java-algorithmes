public class Upturn {

    private String input;
    private Stack stack;
    private int size;

    public Upturn (String _input) {
        this.input = _input;
        this.size = this.input.length();
        this.stack = new Stack(size);
    }

    public void upturnText(){
        for (int i = 0; i < size; i++) {
            char ch = this.input.charAt(i);
            this.stack.push(ch);
        }
    }

    public void upturnDisplay(){
        for (int i = this.stack.getTop(); i>=0; i--){
            System.out.print(this.stack.getStack()[i]);
        }
    }


}
