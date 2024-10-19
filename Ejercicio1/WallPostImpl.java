package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String _text = "Undefined post";
	private int _likes;
	private boolean _featured = false;
	
	
	
	
	public boolean isFeatured() {
		return this._featured;
	}
	
	public void toggleFeatured() {
		this._featured = !this._featured;
		
	}
	
	
	public void dislike() {
		if (this._likes > 0) {
			this._likes--;
		}
	}
	
	
	public void like() {
		this._likes++;		
	}
	
	public int getLikes() {
		return this._likes;
	}
	
	
	public void setText(String texto) {
		this._text = texto;
	}
	
	
	public String getText() {
		return this._text;
	}
	
	
	
	
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
