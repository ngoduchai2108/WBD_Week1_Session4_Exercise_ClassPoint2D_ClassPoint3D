package com.code;

public class Point2D {
    private float x_ = 0.0f;
    private float y_ = 0.0f;
    private float[]xy_ = {x_,y_};
    public Point2D() {
    }

    public Point2D(float x_, float y_) {
        this.x_ = x_;
        this.y_ = y_;
        this.xy_[0]= x_;
        this.xy_[1]= y_;
    }

    public float getX_() {
        return x_;
    }

    public void setX_(float x_) {
        this.x_ = x_;
    }

    public float getY_() {
        return y_;
    }

    public void setY_(float y_) {
        this.y_ = y_;
    }

    public float[] getXY_() {
//        this.xy_[0] = getX_();
//        this.xy_[1] = getY_();
        return xy_ ;
    }

    public void setXY_(float x_, float y_) {
        this.xy_[0] = x_;
        this.xy_[1] = y_;
    }

    @Override
    public String toString() {
        return "(x,y) = ("+ getXY_()[0]+", "+getXY_()[1]+").";
    }
}
