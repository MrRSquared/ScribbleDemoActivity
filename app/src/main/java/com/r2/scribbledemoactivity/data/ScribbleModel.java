package com.r2.scribbledemoactivity.data;


import com.onyx.android.sdk.pen.data.TouchPointList;
import com.onyx.android.sdk.scribble.data.converter.ConverterTouchPointList;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = ScribbleDatabase.class)
public class ScribbleModel extends BaseModel{

    @PrimaryKey
    @Column
    @Unique
    String shapeUniqueId;

    @Column(typeConverter = ConverterTouchPointList.class)
    TouchPointList points;

    public String getShapeUniqueId() {
        return shapeUniqueId;
    }

    public void setShapeUniqueId(String shapeUniqueId) {
        this.shapeUniqueId = shapeUniqueId;
    }

    public TouchPointList getPoints() {
        return points;
    }

    public void setPoints(TouchPointList points) {
        this.points = points;
    }
}