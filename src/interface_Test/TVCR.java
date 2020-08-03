package interface_Test;

public class TVCR extends Tv implements IVCR {
	VCR vcr = new VCR();
	@Override
	public void play() {
		vcr.play();
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		vcr.stop();
		// TODO Auto-generated method stub

	}

	@Override
	public void reset() {
		vcr.reset();
		// TODO Auto-generated method stub

	}

	@Override
	public int getCounter() {
		
		// TODO Auto-generated method stub
		return vcr.getCounter();
	}

	@Override
	public void setCounter(int c) {
		vcr.setCounter(c);
		// TODO Auto-generated method stub

	}

}
