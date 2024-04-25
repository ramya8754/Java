class letterCountEx{
    public static void main(String[] args) {
      String word = "hello Word";
      int[] letterCount = new int[123];
      for(char letter : word.toCharArray()){
          if(letter != ' '){
              letterCount[letter]++;
              }
      }
      for(char letter = 'a' ;letter <= 'z'; letter++){
          if(letterCount[letter] > 0){
          System.out.println("Letter "+ letter+" "+ letterCount[letter]);
          }
      }
    }
}