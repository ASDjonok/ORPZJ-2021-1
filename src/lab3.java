public class lab3 {
    public static void main(String [] args){
        String str1 = "mama abba kaktus";
        String str2 [] = str1.split(" ");
        System.out.println("В кожному слові заданого тексту, видалити всі наступні входження першої літери цього слова:");
        System.out.println(str1);
        for(int i = 0; i < str2.length; i++){
            System.out.print(str2[i].charAt(0));
            for(int j = 0; j < str2[i].length(); j++){
                if(str2[i].charAt(0) == str2[i].charAt(j)){

                }
                else{
                    System.out.print(str2[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
    }
}
