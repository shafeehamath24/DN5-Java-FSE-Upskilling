/* 38. Decompile a Class File
• Objective: Reverse engineer compiled Java bytecode.
• Task: Use a tool like JD-GUI or CFR to decompile a .class file.
• Instructions:
o Write a simple Java program and compile it.
o Open the .class file in a decompiler.
o Analyze the decompiled source. */

class ClassFileDecompiler {

    void showMessage() {

        System.out.println("Class File Decompiler Example");

    }

    public static void main(String[] args) {

        ClassFileDecompiler obj = new ClassFileDecompiler();

        obj.showMessage();

    }
}