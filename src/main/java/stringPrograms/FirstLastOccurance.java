package stringPrograms;

class FirstLastOccurance {
    public static void main(String[] args) {
        char s[]="amazonaanzzaz".toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]=='a'){
                System.out.println("first occurance of 'a' at index: "+ i);
                break;
            }
        }
        for(int j=s.length-1;j>=0;j--){
            if(s[j]=='a'){
                System.out.println("last occurance of 'a' at index: "+ j);
                break;
            }
        }
    }
}
