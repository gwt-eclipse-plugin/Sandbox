# Sandbox
Testing Sandbox

## Linkes

* [Build Server](http://146.148.64.240:8080/)

## Testing

* run `mvn verify` to test build

## Errors

### No Display 

* This occurs when the build server is running on a different user and doesn't have access.
* Try running the build server as the same user as started the Display. 

```
Launching application org.eclipse.ui.ide.workbench...
gdk_mir_display_open
Failed to connect to Mir: Failed to connect to server socket: No such file or directory
```