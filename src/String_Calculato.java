public class String_Calculato {
    private String dilimter;
    {
        dilimter = ",|\n|;|\\*";
    }
    public int calculate(String st) throws Exception {
        String[] str=st.split(dilimter);if(isEmpty(st)){
        return 0;
    }else if(st.length()==1){
        return strtoint(st);
    }else{
        return sum(str);
    }

    }
    private int sum(String[]stt) throws Exception {
        int sum=0;

        for (int i=0;i<stt.length;i++){
            if(Integer.parseInt(stt[i])>=1000){
                continue;
            }else{
                sum+=Integer.parseInt(stt[i]);
            }
        }
        return sum ;
    }
    private boolean isEmpty(String st){
        return st.isEmpty();
    }
    private int strtoint(String st){
        return Integer.parseInt(st);
    }
}
