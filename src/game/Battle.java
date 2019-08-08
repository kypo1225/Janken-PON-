package game;

// じゃんけんの処理を行うクラス
public class Battle {

	private int phase; //ゲームの進行状況を保有する

	//  オブジェクトの生成時に進行状況0:最初の待機画面で初期化する
	public Battle() {
		this.phase = 0;
	}

	//  じゃんけんの処理を行う。自分の勝ちなら1, 負けなら2, あいこなら3をかえす
	public int battle(int p, int e, int phase) { //p:自分の手, e,相手の手
		if (phase == 1) { //進行状況1: 入力待ちのときのみ作動
			//          じゃんけんの手は、グー:1, チョキ:2, パー:3
			if (p == 1) {
				if (e == 1)
					return 3;
				else if (e == 2)
					return 1;
				else if (e == 3)
					return 2;
			}

			else if (p == 2) {
				if (e == 1)
					return 2;
				else if (e == 2)
					return 3;
				else if (e == 3)
					return 1;
			}

			else if (p == 3) {
				if (e == 1)
					return 1;
				else if (e == 2)
					return 2;
				else if (e == 3)
					return 3;
			}
		}
		return -1; //例外
	}

	//進行状況を次の段階へ進める。phaseが3になったら、0へ更新
	public void nextPhase() {
		phase++;
		if (phase > 2)
			phase = 0;
	}

	//進行状況のゲッター
	public int getPhase() {
		return phase;
	}
}