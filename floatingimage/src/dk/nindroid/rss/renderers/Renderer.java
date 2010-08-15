package dk.nindroid.rss.renderers;

import javax.microedition.khronos.opengles.GL10;

import android.content.Intent;
import dk.nindroid.rss.data.ImageReference;
import dk.nindroid.rss.helpers.MatrixTrackingGL;

public abstract class Renderer {
	public abstract void update(MatrixTrackingGL gl, long time, long realTime);
	public abstract void render(MatrixTrackingGL gl, long frameTime, long realtime);
	public long editOffset(long offset, long realTime){
		return offset;
	}
	public abstract void init(GL10 gl, long time, OSD osd);
	public abstract Intent followCurrent();
	public abstract ImageReference getCurrent();
	public abstract boolean back();
	public abstract void onPause();
	public abstract void onResume();
	public abstract void click(MatrixTrackingGL gl, float x, float y, long frameTime, long realTime);
	public abstract boolean slideRight(long realtime);
	public abstract boolean slideLeft(long realtime);
	public abstract void setBackground();
	public abstract void resetImages();
}