package app.controller;

import java.net.URL;

import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

import app.Flamingo;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import pkgCore.GamePlay;
import pkgCore.Table;
import pkgEnum.eAction;

public class BlackJackController implements Initializable {
	private Flamingo FlamingoGame;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	public void setMainApp(Flamingo FlamingoGame)
	{
		this.FlamingoGame = FlamingoGame;
	}

	public void btnSitLeave_Click(ActionEvent event)
	{
		
		Action act = new Action(eAction.Sit, FlamingoGame.getPlayer());
		
		FlamingoGame.messageSend(act);
		
	}
	public void HandleTableState(Table t) {

		/*
		 * Iterator x = t.getHmPlayer().entrySet().itterator();
		 *
		 lblPlayerPos1.setText("");
		lblPlayerPos2.setText("");
		btnPos1SitLeave.setText("Sit");
		btnPos2SitLeave.setText("Sit");
		
		if (t.getHmPlayer().size() > 0) {
			btnPos1SitLeave.setVisible(false);
			btnPos2SitLeave.setVisible(false);
		}
		
		while (x.hasNext()) {
			Map.Entry ent = (Map.Entry) x.next();
			Player player = (Player)ent.getValue();
			
			if (player.getiPlayerPosition() == 1) {
				iblPlayerPos1.setText(player.getPlayerName());
				btnPos1SitLeave.setText("Leave Game");
			}
			else if (player.getiPlayerPosition() == 2) {
				lblPlayerPos2.setText(player.getPlayerName());
				btnPos2SitLeaave.setText("Leave Game");
			}
		}
	}*/

	public void HandleGameState(GamePlay gp) {

		//		Coming Soon....!
	}

}
