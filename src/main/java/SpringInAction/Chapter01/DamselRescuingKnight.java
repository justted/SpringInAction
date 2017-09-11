package SpringInAction.Chapter01;

/**
* 这个类没有什么用，是个反面教材，但是没有错
* */
public class DamselRescuingKnight implements Knight {

  private RescueDamselQuest quest;

  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
