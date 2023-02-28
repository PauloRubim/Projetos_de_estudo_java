package q_learning;

public class Q_learning {
  public static void main(String[] args) throws InterruptedException {
    Game game = new Game();
    float gamma = 0.8f;
    float epsilon = 0.5f;
    float alpha = 0.1f;
    Agent agent = new Agent(gamma, epsilon,alpha,game);
    agent.play(10000000);
  }
}

