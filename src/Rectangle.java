public class Rectangle {
    private double height;
    private double width;


    public Rectangle() {
        height = 1;
        width = 1;
    };

    public Rectangle(double height, double width) throws Exception {
        if (!isValidWidthOrHeight(height)) {
            Exception exHeight = new Exception("Error: Negative or Zero height input.");
            throw exHeight;
        }
        if (!isValidWidthOrHeight(width)) {
            Exception exWidth = new Exception("Error: Negative or Zero Width input.");
            throw exWidth;
        }
        try {
            this.height = height;
            this.width = width;
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    //get & set
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) throws Exception {
        if (!isValidWidthOrHeight(height)) {
            Exception exHeight = new Exception("Error: Negative or Zero height input.");
            throw exHeight;
        }
        try {
            this.height = height;
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) throws Exception {
        if (!isValidWidthOrHeight(width)) {
            Exception exWidth = new Exception("Error: Negative or Zero Width input.");
            throw exWidth;
        }
        try {
            this.width = width;
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    //IS
    private boolean isValidWidthOrHeight(double i) {
        try {
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }

    //Get area
    public double getArea() {
        try {
            double area = width * height;
            return area;
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public double getPerimeter() {
        try {
            double perimeter = 2 * (width + height);
            return perimeter;
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }

    //equals
    public boolean equals(Object rect) {
        try  {
            if (rect == this) {
                return true;
            }

            if (rect instanceof Rectangle) {
                Rectangle rec = (Rectangle) rect;
                if (rec.width == this.width && rec.height == this.height) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    //toString()
    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Rectangle: Width is " + this.width + " & Height is " + this.height);
            return sb.toString();
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public void print() {
        try {
            System.out.println("Width: " + this.width);
            System.out.println("Height: " + this.height);
        } catch (Exception e) {
            System.out.print("Error. Exception is \n" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

}
