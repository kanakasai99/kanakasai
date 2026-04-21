package stringPrograms;


public class AlternativeCapitalForParticularWord {
    public static void main(String[] args){
        String s[]="Kanaka Sai Mereddy".split(" ");
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length;i++){
            if(i==2){
                for(int j=0;j<s[i].length();j++){
                    if(j%2==0){
                        st.append(Character.toUpperCase(s[i].charAt(j)));
                    }
                    else{
                        st.append(s[i].charAt(j));
                    }

                }
                st.append(" ");

            }
            else{
                st.append(s[i]).append(" ");
            }

        }

        System.out.println(st.toString());
    }

}
