package knight;

/**
* 这个类没有什么用，是个反面教材，但是没有错
* */
public class DamselRescuingKnight implements knight.Knight {

  private knight.RescueDamselQuest quest;

  public DamselRescuingKnight() {
    this.quest = new knight.RescueDamselQuest();
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
