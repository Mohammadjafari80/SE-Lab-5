# آزمایش پنجم

## بخش اول

در این بخش ابتدا فایل javacup را بدون بهینه‌سازی اجرا کرده و وضعیت مصرف منابع آن‌ و بخش‌هایی از قطعه کد که بیشترین مصرف را ایجاد می‌کنند بررسی می‌کنیم.

- خروجی کد با ورودی 1,2,3 -> NO

![photo_5981160667907998376_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/9bfd3d70-91d4-4bb8-ba2e-3d6f84384be3)

- وضعیت CPU و Thread در حالت بدون بهینه سازی:
  
![photo_5981160667907998378_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/6589d1b4-2626-4f21-a74d-375930c62308)

- وضعیت Call Tree در حالت بدون بهینه سازی مشخص می‌کند متد temp هم از لحاظ ران تایم و هم از لحاظ مصرف منابع بیشترین مصرف را دارد
  
![photo_5981160667907998375_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/98d1f370-664c-4b53-b919-d001120d62ae)

- این موضوع در قسمت Methods هم مشخص است که متد temp ران تایم زیادی دارد:

![photo_5981160667907998377_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/2c7df603-bba5-44ba-ad88-57d24623eebb)

- وضعیت Memory و منابع استفاده شده:

![photo_5981160667907998399_y (1)](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/1ebd8000-bf96-40a4-9035-3285d91ac522)


مشکل متد temp در استفاده از ArrayList است. به جای استفاده از ArrayList می توانیم از primitive array (int[]) ها استفاده کنیم تا ذخیره کنیم که هم memory-efficient تر و هم سریع تر است.

بعد از این تغییر دوباره وضعیت مصرف منابع را بررسی می کنیم:


- خروجی کد تغییری نکرده و ورودی ها هم یکسان است:
![photo_5981160667907998379_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/5dc19148-f013-4d5b-a30d-9d5b52e5a85b)

- وضعیت CPU و Thread در حالت بهینه سازی کاهش پیدا کرده است:

![photo_5981160667907998381_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/27bc86bd-b674-4869-b308-f133d0e2f913)

- وضعیت Call Tree مشخص می‌کند که مصرف متد temp کاهش پیدا کرده:

![photo_5981160667907998380_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/efab6628-765c-4860-ad65-443c064191ff)

- قسمت Method هم مشخص می کند که با ورودی یکسان ۱۰۰ می‌شود:

<img width="1117" alt="Screenshot 2023-08-19 100159 (1)" src="https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/9c2456e0-08f9-4763-a07f-9cac2dae793c">

- وضعیت Memory و منابع استفاده شده:

![photo_5981160667907998396_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/dd188437-7d70-4bd0-91f3-0c6d3221a98a)


---

## بخش دوم

در بخش دوم کد تولید دنباله‌ی فیبوناچی را پیاده سازی کردیم

- خروجی کد با ورودی 50:
![photo_5981160667907998388_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/a8d167b6-ee3b-4cfb-b2a5-085171f2a913)

 وضعیت CPU و Thread در حالت بدون بهینه سازی:
![photo_5981160667907998387_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/0000e1a2-9c74-47f0-a868-e654ccafaf96)


- وضعیت Call Tree در حالت بدون بهینه سازی:
  
![photo_5981160667907998389_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/142544a0-ee87-49fb-bc27-3a533849d2e8)

- این موضوع در قسمت Methods هم مشخص است که متد fibonacci ران تایم زیادی دارد:

![photo_5981160667907998390_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/218359ea-2a4c-442c-8df7-cb993c800d2d)

- وضعیت Memory و منابع استفاده شده:

![photo_5981160667907998397_y (1)](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/e1c0a131-b608-43ea-9565-08dfa56d021d)


برای بهینه سازی به جای پیاده سازی به روش  recursive از روش iterrative استفاده کردیم

بعد از این تغییر دوباره وضعیت مصرف منابع را بررسی می کنیم:

- خروجی کد تغییری نکرده و ورودی ها هم یکسان است:

![photo_5981160667907998383_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/05d072aa-30ea-4346-a744-1ebc0d44a031)


- وضعیت CPU و Thread در حالت بهینه سازی کاهش پیدا کرده است:

![photo_5981160667907998382_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/bfc28159-3b05-4b8f-8bff-d6baa228b900)


- وضعیت Call Tree مشخص می‌کند که مصرف و زمان کد کاهش پیدا کرده:

![photo_5981160667907998384_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/184ee57f-92d5-4f9c-a1b7-3ce0a706f86a)

- قسمت Method:

![photo_5981160667907998385_y](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/526ebf5f-0fce-4a9e-82a3-adfec9e1198e)

- وضعیت Memory و منابع استفاده شده:

![photo_5981160667907998398_y (1)](https://github.com/Mohammadjafari80/SE-Lab-5/assets/59197179/53d41b1e-6f50-457e-8c2a-22188d9fdd0a)









