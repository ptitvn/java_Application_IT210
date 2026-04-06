package com.bt2.model;

public class Student {
    private String fullName;
    private double score;

    public Student(String fullName, double score) {
        this.fullName = fullName;
        this.score = score;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    // Logic xếp loại được tính toán trực tiếp ở Model
    public String getRank() {
        if (score >= 90) return "Xuất sắc";
        if (score >= 80) return "Giỏi";
        if (score >= 70) return "Khá";
        if (score >= 60) return "Trung bình khá";
        if (score >= 50) return "Trung bình";
        return "Yếu";
    }
}