package stack.reference.recursion;

public class TowerOfHanoiSolver {
	void showSteps(int numberOfTowers, char startingTower, char endingTower, char helperTower) {
		if (numberOfTowers == 1) {
			System.out.println("Take disk from " + startingTower + " to " + endingTower);
			return;
		}
		showSteps(numberOfTowers - 1, startingTower, helperTower, endingTower);
		System.out.println("Take disk from " + startingTower + " to " + endingTower);
		showSteps(numberOfTowers - 1, helperTower, endingTower, startingTower);
	}
}
class Main {
	public static void main(String[] args) {
		TowerOfHanoiSolver towerOfHanoiSolver = new TowerOfHanoiSolver();
		towerOfHanoiSolver.showSteps(3, 'A', 'C', 'B');
	}
}