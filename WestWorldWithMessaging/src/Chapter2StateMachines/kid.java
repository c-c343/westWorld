package Chapter2StateMachines;

import common.Messaging.Telegram;
import Chapter2StateMachines.kidOwnedStates.kidsGlobalState;
import Chapter2StateMachines.kidOwnedStates.play;
import static common.windows.*;
import static common.misc.ConsoleUtils.*;

public class kid BaseGameEntity{
  private StateMachine <kid> m_pStateMachine;
  private location_type m_Location;
  
  boolean m_playing;

}
