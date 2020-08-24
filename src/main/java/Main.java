import static org.bytedeco.llvm.global.LLVM.LLVMConstInt;
import static org.bytedeco.llvm.global.LLVM.LLVMConstIntGetSExtValue;
import static org.bytedeco.llvm.global.LLVM.LLVMInt32Type;

import org.bytedeco.llvm.LLVM.LLVMValueRef;

public class Main {

	public static void main(String[] args) {
		LLVMValueRef const2 = LLVMConstInt(LLVMInt32Type(), 2, 0);

		System.out.println("Value: " + LLVMConstIntGetSExtValue(const2));
	}

}
