package com.mgu.java16.record;

public record Parcel<T>(T contents,
                        double length,
                        double breadth,
                        double height,
                        double weight) {
}
