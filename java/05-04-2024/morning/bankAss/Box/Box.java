public class Box {
    private int height;
    private int width;
    private int length;

    public Box(int h, int w, int l){
        height = h;
        width = w;
        length = l;
    }

    public int volume(){
        return height * length * width;
    }

    public String toString(){
        return height + " : " + width + " : " + length;
    }

    public int hashCode(){
        return height+width+length;
    }

    public boolean equals(Object other){
        if (other instanceof Box) {
            Box th = (Box) other;
            return (this.height == th.height) && (this.width == th.width) && (this.length == th.length);
        }
        return false;
    }
}
