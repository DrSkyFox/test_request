

// auth.terasms.ru/outbox/send/json$login$password$sender$target$sms

// SendSmsURI = http://auth.terasms.ru/outbox/send/?login=$login$&password=$password$&target=$phones$&sender=ABG&message=$sms$&type=cascade
// start index 0


function httpPost(theUrl, theParams)
{
    // const var xmlHttp = getXmlHttp();
    let parseData = theUrl.split('$');

    let message = {
        login: parseData[1],
        password: parseData[2],
        target: parseInt(parseData[4], 10),
        message parseData[5],
        sender: parseData[3]
    }
    let res = fetch(parseData[0], {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(message)
    });

    return res;
}

