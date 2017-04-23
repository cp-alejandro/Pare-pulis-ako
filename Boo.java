public class Boo{
  /*STATS*/
  private int coins;
  private int level; //in game max level = 60
  private int energy; //max 50 points
  private int fullness; //max 30 points?
  private int love; //max 20 points?
  private boolean dirty;
  
  
  /*APPEARANCE*/
  //paano sasabihin na yung default color ay blue :( sa GUI na ba to?
  
  /*INVENTORY*/
  ArrayList<Food> foodOwned = new ArrayList<Food>();
  ArrayList<Medicine> medicineOwned = new ArrayList<Medicine>();
  ArrayList<Toy> toysOwned = new ArrayList<Toy>();
  
  public Boo{
    this.coins = 1000;
    this.level = 1;
    this.energy = 30;
    this.fullness = 15;
    this.love = 10;
    this.dirty = False;
  }
  
  public void walk(){
    /*kapag naglalakad sa Community, kapag nakakakuha
    ng coins mula sa trees (every 10 minutes ka makakakuha ng coins)
    nababawasan yung energy*/
  }
  
  public void eat(Food food){
    /*eating food increases fullness & level*/
    this.fullness += food.getNutrients();
    this.love += food.getLove();
    this.coins -= food.getCost();
  }
  
  public void cleanBoo(){
    if(this.dirty==True){
      this.dirty = False;
      this.coins += 1;
    }
  }
  
  public void petBoo(){
    /*random number of taps on Boo gives one coin*/
  }
  
  public void takeMedicine(Medicine meds){
    /*depending on the medicine, stats will change
    -medicine: affects all stats
    -energy drink: affects energy
    -protein potion: affects fullness/protein
    -love potion: affects love*/
  }
  
  public void play(Toy toy){
    /*playing with toys increases coins, love, and level*/
  }
  
  public void sleep(Lamp lamp){
    /*sleeping restores energy*/
    /*to sleep, turn off lamp*/
  }
}
