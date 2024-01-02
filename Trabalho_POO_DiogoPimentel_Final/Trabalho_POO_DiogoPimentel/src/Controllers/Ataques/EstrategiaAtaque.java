package Controllers.Ataques;

import Domain.Entidades.Entidade;
import Domain.Entidades.Heroi;
import Domain.Entidades.NPC;

public interface EstrategiaAtaque {

    Entidade ataquePai (NPC npc, Heroi heroi);
}
