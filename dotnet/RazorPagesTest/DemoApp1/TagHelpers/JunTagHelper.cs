using Microsoft.AspNetCore.Razor.TagHelpers;

namespace DemoApp.TagHelpers;

[HtmlTargetElement("jun", Attributes = "not-ok")]
public class JunTagHelper : TagHelper
{
    public int NotOk { get; set; }

    public override void Process(TagHelperContext context, TagHelperOutput output)
    {
        output.TagName =  "div";
        for(int i=1; i<=NotOk; ++i){
            string ans = "not-ok:  " + i;     
            output.Content.Append(ans);
        }
        
    }
}
