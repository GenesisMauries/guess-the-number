
    public class MockPlayer extends Player {

        private int guess;

        public MockPlayer(int guess) {
            super("Mock Player");
            this.guess = guess;
        }

        @Override
        public int makeGuess() {
            return guess;
        }
    }


