class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t= bandage[0];
        int x= bandage[1];
        int y= bandage[2];
        
        int maxHealth = health;
        
        int sequence = 0;
        int currentTime = 0;
        int attackIndex = 0;
        
        int lastAttack = attacks[attacks.length-1][0];
        
        
        
        while(currentTime <= lastAttack){
            if(currentTime == attacks[attackIndex][0]){
                health -= attacks[attackIndex][1];
                if(health <= 0) return -1;
                
                attackIndex++;
                sequence=0;
            }
            else{
                sequence++;
                health=Math.min(health+x,maxHealth);
                
                if(sequence==t){
                    health=Math.min(health+y,maxHealth);
                    sequence=0;
                }
            }
            currentTime++;
        }
        return health;
        
    }
}