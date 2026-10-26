package application;
public class Cards {
   private String name;
   private String position;
   private int pace;
   private int shooting;
   private int passing;
   private int dribbling;
   private int defending;
   private int physicality;
   private int overall;
   private String image;
   public Cards() {
       // Default constructor for flexibility
   }
   public Cards(String name, String position, int pace, int shooting, int passing, int dribbling,
               int defending, int physicality, int overall, String image) {
       this.name = name;
       this.position = position;
       this.pace = Math.max(0, Math.min(100, pace));
       this.shooting = Math.max(0, Math.min(100, shooting));
       this.passing = Math.max(0, Math.min(100, passing));
       this.dribbling = Math.max(0, Math.min(100, dribbling));
       this.defending = Math.max(0, Math.min(100, defending));
       this.physicality = Math.max(0, Math.min(100, physicality));
       this.overall = Math.max(0, Math.min(100, overall));
       this.image = image;
   }
   // Getters
   public String getName() {
       return name;
   }
   public String getPosition() {
       return position;
   }
   public int getPace() {
       return pace;
   }
   public int getShooting() {
       return shooting;
   }
   public int getPassing() {
       return passing;
   }
   public int getDribbling() {
       return dribbling;
   }
   public int getDefending() {
       return defending;
   }
   public int getPhysicality() {
       return physicality;
   }
   public int getOverall() {
       return overall;
   }
   public String getImage() {
       return image;
   }
   // Setters
   public void setName(String name) {
       this.name = name;
   }
   public void setPosition(String position) {
       this.position = position;
   }
   public void setPace(int pace) {
       this.pace = Math.max(0, Math.min(100, pace));
   }
   public void setShooting(int shooting) {
       this.shooting = Math.max(0, Math.min(100, shooting));
   }
   public void setPassing(int passing) {
       this.passing = Math.max(0, Math.min(100, passing));
   }
   public void setDribbling(int dribbling) {
       this.dribbling = Math.max(0, Math.min(100, dribbling));
   }
   public void setDefending(int defending) {
       this.defending = Math.max(0, Math.min(100, defending));
   }
   public void setPhysicality(int physicality) {
       this.physicality = Math.max(0, Math.min(100, physicality));
   }
   public void setOverall(int overall) {
       this.overall = Math.max(0, Math.min(100, overall));
   }
   public void setImage(String image) {
       this.image = image;
   }
   @Override
   public String toString() {
       return "Card{" +
               "\nname='" + name + '\'' +
               ",\nposition='" + position + '\'' +
               ",\npace=" + pace +
               ",\nshooting=" + shooting +
               ",\npassing=" + passing +
               ",\ndribbling=" + dribbling +
               ",\ndefending=" + defending +
               ",\nphysicality=" + physicality +
               ",\noverall=" + overall +
               ",\nimage='" + image + '\'' +
               "\n}";
   }
}
