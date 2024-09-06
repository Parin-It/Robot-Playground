*** Variables ***
${var}    Parin
*** Test Cases ***
TC01 - Test hello
    Log To Console     Hello World ${var}
# TC02 - Please fail
#     Log To Console     Hello World But Fail
#     Fail    I want to fail.