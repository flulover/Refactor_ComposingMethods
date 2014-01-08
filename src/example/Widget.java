package example;

public class Widget {

    private boolean _isValid;
    private boolean _visible = true;
    private boolean _enabled = true;
    private boolean _isRequired = true;
    private String _text;
    private String _errorMessage;
    private int _maxLength = 100;
    private int _minLength = 10;

    public void Validate()
    {
        _isValid = true;
        if (!_visible || !_enabled){
            return;
        }

        if (_isRequired){
            if (_text.isEmpty() || _text.length() == 0){
                _errorMessage = "Required field can not be empty.";
                _isValid = false;
            }
        }

        if (_maxLength != 0 && _text.length() > _maxLength)
        {
            _errorMessage = "Text length can not exceed" + _maxLength;
            _isValid = false;
        }

        if (_minLength != 0 && _text.length() < _minLength)
        {
            _errorMessage = "Text length can not under" + _minLength;
            _isValid = false;
        }
    }

    public boolean isValid() {
        return _isValid;
    }

    public void setText(String text) {
        _text = text;
    }

    public int getMaxLength(){
        return _maxLength;
    }
}