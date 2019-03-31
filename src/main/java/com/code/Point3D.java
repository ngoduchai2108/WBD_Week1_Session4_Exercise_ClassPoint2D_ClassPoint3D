package com.code;

public class Point3D extends Point2D {
    private float z_ = 0.0f;
    private float[] xyz_ = new float[3];

    public Point3D() {
    }

    public Point3D(float x_, float y_, float z_) {
        super(x_, y_);
        this.z_ = z_;
        this.xyz_[0] = x_;
        this.xyz_[1] = y_;
        this.xyz_[2] = z_;
    }

    public float getZ_() {
        return z_;
    }

    public void setZ_(float z_) {
        this.z_ = z_;
    }

    public float[] getXYZ_() {
        return xyz_;
    }

    public void setXYZ_(float x_,float y_,float z_) {
        xyz_[0] = x_;
        xyz_[1] = y_;
        xyz_[2] = z_;
    }

    @Override
    public String toString() {
        return "(x,y,z) = ("+ getXYZ_()[0]+", "+ getXYZ_()[1]+", "+ getXYZ_()[2]+").";
    }
}
