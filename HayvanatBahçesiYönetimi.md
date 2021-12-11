# HAYVANAT BAHÇESİ YÖNETİMİ
Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

Hayvanlar:

1. Atlar (atlar, zebralar, eşekler vb.),
2. Kedigiller (kaplanlar, aslanlar vb.),
3. Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
4. Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.tür adı, ağırlığı, yaşı vb.
5. Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
6. Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
7. Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.

![Untitled Diagram drawio (1)](https://user-images.githubusercontent.com/36278457/145689617-9ffd5760-1c9f-436c-8a33-7b0452a5935d.png)
