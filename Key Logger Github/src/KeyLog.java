/**
 * Arman Saadat - Java Basic Key Listener
 * 12/16/2021
 * 
 * Key: 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
 */

//jnativehook imports (to listen on keystrokes)
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

//Main Class
public class KeyLog implements NativeKeyListener {

	public static void main(String[] args) {
	
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			//Print Error
			e.printStackTrace();
		}
		
		//Add instance of the key stroke logger to global screen
		GlobalScreen.addNativeKeyListener(new KeyLog());
	
	}

	//Overridden method - when key pressed, key is recorded.
	public void nativeKeyPressed(NativeKeyEvent KeyStroke) {
		System.out.print(NativeKeyEvent.getKeyText(KeyStroke.getKeyCode()));
	}

	/** unused overridden methods**/
	public void nativeKeyReleased(NativeKeyEvent KeyStroke) {
		NativeKeyListener.super.nativeKeyReleased(KeyStroke);
	}

	
	public void nativeKeyTyped(NativeKeyEvent KeyStroke) {
		NativeKeyListener.super.nativeKeyTyped(KeyStroke);
	}

}