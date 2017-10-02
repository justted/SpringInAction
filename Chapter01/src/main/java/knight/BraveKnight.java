package knight;

public class BraveKnight implements knight.Knight {

  private knight.Quest quest;

  public BraveKnight(knight.Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
