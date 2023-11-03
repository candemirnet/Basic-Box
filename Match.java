public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int round = 1;
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.maxWeight = maxWeight;
        this.f1= f1;
        this.f2 = f2;
        this. minWeight = minWeight;
    }

    void run(){
        if(isCheck()){
            firstDamage();
            System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
            System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            System.out.println();
            while((this.f1.health>=0) && (this.f2.health>=0)){
                round+=1;
                System.out.println("----------------" + round + ". ROUND------------");
                this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                System.out.println();
            }
        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }

    }

    boolean isCheck(){
        return((this.minWeight<= this.f1.weight && this.maxWeight>=this.f1.weight) && (this.minWeight<=this.f2.weight && this.maxWeight>= this.f2.weight));
    }


    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }
        return false;
    }

    int firstDamage(){
            double number = Math.random() * 1;
            if(number <= 0.5){
                System.out.println("İlk Vuruşu " + this.f1.name + " Yaptı");
                return (this.f2.health = this.f1.hit(this.f2));
            }else{
                System.out.println("İlk Vuruşu " + this.f2.name + " Yaptı");
                return (this.f1.health = this.f2.hit(this.f1));
            }
        }

}


