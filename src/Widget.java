class Widget {

    private boolean IsValid;
    private boolean Visible;
    private boolean Enabled;
    private boolean IsRequired;
    private String Text;
    private String ErrorMessage;
    private int MaxLength = 100;
    private int MinLength = 10;

    public void Validate()
    {
        IsValid = true;
        if (!Visible || !Enabled){
            return;
        }

        if (IsRequired){
            if (Text.isEmpty() || Text.length() == 0){
                ErrorMessage = "Required field can not be empty.";
                IsValid = false;
            }
        }

        if (MaxLength != 0 && Text.length() > MaxLength)
        {
            ErrorMessage = "Text length can not exceed" + MaxLength;
            IsValid = false;
        }

        if (MinLength != 0 && Text.length() < MinLength)
        {
            ErrorMessage = "Text length can not under" + MinLength;
            IsValid = false;
        }
    }
}