import androidx.compose.ui.window.ComposeUIViewController
import com.niraj.wordleMultiplatform.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
