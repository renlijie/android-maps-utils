package com.google.maps.android.clustering;

import com.google.android.gms.maps.model.LatLng;

/**
 * ClusterItem represents a marker on the map.
 */
public abstract class ClusterItem {
    private Cluster cluster;

    /**
     * The position of this marker. This must always return the same value.
     */
    abstract public LatLng getPosition();

    public Cluster getCluster() {
      return cluster;
    }

    public void setCluster(Cluster cluster) {
      this.cluster = cluster;
    }
}