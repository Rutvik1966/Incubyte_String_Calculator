public class String_Calculato {
    public int calculate(String st){
    if(isEmpty(st)){
        return 0;
    }
    return strtoint(st);
    }
    private boolean isEmpty(String st){
        return st.isEmpty();
    }
    private int strtoint(String st){
        return Integer.parseInt(st);
    }
}
